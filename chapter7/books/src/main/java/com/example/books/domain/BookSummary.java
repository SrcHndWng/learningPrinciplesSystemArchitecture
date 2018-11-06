package com.example.books.domain;

public class BookSummary{
    public final Title title;
    public final Price unitPrice;
    public final LocalDate published;
    public final Auther auther;
    public final BookType bookType;

    public BookSummary(Title title,
                       Price unitPrice,
                       LocalDate published,
                       Auther auther,
                       BookType bookType){
        this.title = title;
        this.unitPrice = unitPrice;
        this.published = published;
        this.auther = auther;
        this.bookType = bookType;
    }

    public String toString(){
        final String SEPARATER = " : ";
        StringBuilder builder = new StringBuilder();
        builder.append(title.value);
        builder.append(SEPARATER);
        builder.append(unitPrice.toString());
        builder.append(SEPARATER);
        builder.append(published.toString());
        builder.append(SEPARATER);
        builder.append(auther.toString());
        builder.append(SEPARATER);
        builder.append(bookType.toString());
        return builder.toString();
    }
}