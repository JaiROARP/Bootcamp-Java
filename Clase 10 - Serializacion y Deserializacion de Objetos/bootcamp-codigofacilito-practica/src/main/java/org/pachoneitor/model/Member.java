package org.pachoneitor.model;

public class Member extends User {

    public Member(String name) {
        super(name);
    }

    @Override
    public void requestBook(Library library, int bookId) {
        library.lendBook(user:this, bookId);
    }

}
