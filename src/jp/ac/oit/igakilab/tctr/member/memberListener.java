package jp.ac.oit.igakilab.tctr.member;

import java.util.List;

import jp.ac.oit.igakilab.tctr.db.MemberDatabaseCreator;

public class memberListener {
MemberDatabaseCreator mdc = new MemberDatabaseCreator();
memberManager mm = new memberManager();
public List<memberManager> memberListen(){
return mdc.memberListen("memberListen",mm);
}
public static void main(String[] args){
    memberListener pl = new memberListener();
    for(memberManager pm:pl.memberListen()){
        System.out.println("ID:"+pm.getId());
        System.out.println("Name:"+pm.getName());
        System.out.println("Org:"+pm.getOrg());
        System.out.println("Position:"+pm.getPosition());
        System.out.println("Age:"+pm.getAge());
    }
}
}