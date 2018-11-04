package com.example.sampleDdd.repository;

import com.example.sampleDdd.domain.Amount;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class BankAccountDatasource implements BankAccountRepository{
    @Override
    public Amount balance() {
        try{
            Class.forName("org.sqlite.JDBC");

            try(Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db")){
                Statement statement = connection.createStatement();
                statement.setQueryTimeout(30);

                // 仮の口座として毎回登録する
                statement.executeUpdate("drop table if exists amount");
                statement.executeUpdate("create table amount (value integer)");
                statement.executeUpdate("insert into amount values(10000)");
                return selectAmount(statement);
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void withdraw(Amount amount) {
		try{
            Class.forName("org.sqlite.JDBC");

            try(Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db")){
                Statement statement = connection.createStatement();
                statement.setQueryTimeout(30);

                final Amount currentAmount = selectAmount(statement);
                final int updateValue = currentAmount.value - amount.value;

                final String updateSql = "update amount set value = ?";
                try(PreparedStatement pstmt = connection.prepareStatement(updateSql)){
                    pstmt.setInt(1, updateValue);
                    pstmt.executeUpdate();
                }

                final Amount updatedAmount = selectAmount(statement);
                System.out.println("amount updated " + updatedAmount.value);
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    
    private Amount selectAmount(Statement statement){
        try{
            ResultSet rs = statement.executeQuery("select * from amount");
            rs.next();
            return new Amount(rs.getInt("value"));
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}