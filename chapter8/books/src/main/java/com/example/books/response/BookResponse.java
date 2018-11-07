package com.example.books.response;

import java.util.ArrayList;
import java.util.List;

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
            json.put("type", book.bookType.name());
            jsons.add(json);
        }
    }

    public static BookResponse fromBooks(List<BookSummary> books) throws JSONException {
        BookResponse bookResponse = new BookResponse(books);
        return bookResponse;
    }

    public String json(){
        String result = "";
        for(JSONObject json : jsons){
            result += json.toString();
        }
        return result;
    }
}