package jp.ac.oit.igakilab.tctr.project;

import org.apache.commons.lang3.RandomStringUtils;

import jp.ac.oit.igakilab.tctr.db.ProjectDatabaseCreator;

public class projectCreator {
projectManager pm = new projectManager();
ProjectDatabaseCreator pdc = new ProjectDatabaseCreator();
public void projectCreate(String name,String owner,String overview){
pm.setName(name);
pm.setId(RandomStringUtils.randomAlphabetic(1)+RandomStringUtils.randomAlphanumeric(5));
pm.setOwner(owner);
pm.setOverview(overview);
pdc.projectInsert("createProject", pm);
pdc.projectInsert("overviewInsert",pm);
}
public static void main(String[] args){

}

}