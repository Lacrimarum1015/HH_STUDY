package bean;

public class Resume {

    private String name;
    /**
     *性别(int)
     * 女：0
     * 男：1
     * */
    private String gender;

    private String id;

    private String school;
    /**
     *
     * * 0：已申请
     * 1：简历通过
     * 2：笔试通过
     * 3：体检通过
     * 4：背调通过
     * 5：已签约
     * 6：已入职
     */
    private int process;
    /**
    *逻辑删除
     * 0 : 不展示
     * 1 : 展示
    */
    private int deleteStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender(){return gender;}

    public void setGender(String gender){
        while(gender!="男"&&gender!="女"){
            System.out.println("性别输入错误，请重新输入性别：");
        }
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Resume(String name, String id) {
        this.name = name;
        this.id = id;
        this.process=0;
        this.deleteStatus=0;
    }

    public Resume(String name, String id, String gender, String school, int process) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.school = school;
        this.process = process;
    }
}
