package test;

import java.util.List;

public class TestPeople {
    private int id;
    private List<Stu> stuList;

    public TestPeople(int id, List<Stu> stuList) {
        this.id = id;
        this.stuList = stuList;
    }

    @Override
    public String toString() {
        return "TestPeople{" +
                "id=" + id +
                ", stuList=" + stuList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Stu> getStuList() {
        return stuList;
    }

    public void setStuList(List<Stu> stuList) {
        this.stuList = stuList;
    }
}
