package easy.JavaPriorityQueue;

import java.util.*;

class Priorities {
    private final PriorityQueue<Student> q = new PriorityQueue<Student>();

    public List<Student> getStudents(List<String> events) {
        for(String string: events){
            String[] val = string.split(" ");
            if("ENTER".equals(val[0])){
                Student st = new Student(Integer.parseInt(val[3]), val[1], Double.parseDouble(val[2]));
                q.offer(st);
            } else {
                q.poll();
            }
        }
        List<Student> result = new ArrayList<>();
        while(!q.isEmpty()){
            result.add(q.poll());
        }
        return result;
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    @Override
    public String toString(){
        return String.format("%s %s %s", name, id, cgpa);
    }

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int result = -1 * Double.compare(this.getCgpa(), o.getCgpa());
        if (result == 0) {
            result = this.getName().compareTo(o.getName());
            if (result == 0) {
                result = Integer.compare(this.getId(), o.getId());
            }
        }
        return result;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st);
            }
        }
    }

}