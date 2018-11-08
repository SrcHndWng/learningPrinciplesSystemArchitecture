package com.example.books.response;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import com.example.books.domain.BookSummary;

import org.json.JSONException;
import org.json.JSONObject;

public class BookResponse {
    private final List<JSONObject> jsons;

    private BookResponse(List<BookSummary> books) throws JSONException{
        jsons =  new ArrayList<JSONObject>();
        for(BookSummary book : books){
            JSONObject json =  new JSONObject();
            json.put("title", book.title.value);
            json.put("unitPrice", book.unitPrice.toString());
            json.put("published", book.published.toString());
            json.put("auther", book.auther.forApi());
            json.put("type", book.bookType.name());
            jsons.add(json);
        }
    }

    public static BookResponse fromBooks(List<BookSummary> books) throws JSONException {
        BookResponse bookResponse = new BookResponse(books);
        return bookResponse;
    }

    public String json(){
        StringJoiner  result = new StringJoiner(",");
        for(JSONObject json : jsons){
            result.add(json.toString());
        }
        return result.toString();
    }
}