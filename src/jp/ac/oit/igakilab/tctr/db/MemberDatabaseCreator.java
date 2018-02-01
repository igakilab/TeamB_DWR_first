package jp.ac.oit.igakilab.tctr.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jp.ac.oit.igakilab.tctr.member.memberManager;

public class MemberDatabaseCreator {
SqlSessionFactory factory = DBUtility.getSqlSessionFactory();
List<memberManager> memberList = new ArrayList<>();

public List<memberManager> memberListen(String mapper,memberManager mm){
try (SqlSession session = factory.openSession()){
memberList = session.selectList(mapper,mm);
}
return memberList;
}
}