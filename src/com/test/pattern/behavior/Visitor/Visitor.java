package com.test.pattern.behavior.Visitor;


//一个Visitor类，存放要访问的对象，
public interface Visitor {
    public void visit(Subject sub);
}
