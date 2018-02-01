package jp.ac.oit.igakilab.tctr.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jp.ac.oit.igakilab.tctr.project.projectManager;

public class ProjectDatabaseCreator {
    SqlSessionFactory factory = DBUtility.getSqlSessionFactory();
    List<projectManager> selectList = new ArrayList<>();



    public List<projectManager> projectListen(String mapper){
        try (SqlSession session = factory.openSession()){
            selectList = session.selectList(mapper);
        }
        return selectList;
    }
    public void projectInsert(String mapper,projectManager pm){
    	try (SqlSession session = factory.openSession()){
    	session.insert(mapper,pm);
    	session.commit();
    	}
    	}
}