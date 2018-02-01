package jp.ac.oit.igakilab.tctr.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jp.ac.oit.igakilab.tctr.todoList.todoManager;

public class TodoDatabaseCreator {
SqlSessionFactory factory = DBUtility.getSqlSessionFactory();

public List<todoManager> todoListen(){
List <todoManager> todoItem = new ArrayList<>();
try (SqlSession session = factory.openSession()){
todoItem = session.selectList("todoListen");
}
return todoItem;
}
}