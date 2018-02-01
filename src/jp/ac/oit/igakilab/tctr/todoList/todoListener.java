package jp.ac.oit.igakilab.tctr.todoList;

import java.util.List;

import jp.ac.oit.igakilab.tctr.db.TodoDatabaseCreator;

public class todoListener {
public List<todoManager> todoListen(){
TodoDatabaseCreator mdb = new TodoDatabaseCreator();
return mdb.todoListen();
}

public static void main(String[] args){

}
}