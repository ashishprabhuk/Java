package Interfaces;

// The Employee interface represents employees in the company.
interface Employee {
    void work();
}

// The Manager interface represents managers, a specific type of employee.
interface Manager extends Employee {
    void supervise();
}

// The TeamLead class represents a specific manager, a team lead, in the company
class TeamLead implements Manager {
    @Override
    public void work() {
        System.out.println("Team lead is working");
    }

    @Override
    public void supervise() {
        System.out.println("Team lead is supervising the team");
    }
}

// The Task interface represents tasks assigned to employees.
interface Task {
    void execute();
}

// The Meeting class represents meetings in the company.
class Meeting implements Task {
    @Override
    public void execute() {
        System.out.println("Meeting is in progress");
    }
}

// The Project class represents projects in the company.
class Project implements Task {
    @Override
    public void execute() {
        System.out.println("Project is being worked on");
    }
}

// The WorkTool interface represents tools used by employees.
interface WorkTool {
    void start();

    void stop();
}

// The Laptop class represents laptops used by employees.
class Laptop implements WorkTool {
    @Override
    public void start() {
        System.out.println("Laptop started");
    }

    @Override
    public void stop() {
        System.out.println("Laptop shut down");
    }
}

// The Phone class represents phones used by employees.
class Phone implements WorkTool {
    @Override
    public void start() {
        System.out.println("Phone started");
    }

    @Override
    public void stop() {
        System.out.println("Phone turned off");
    }
}

// The Communicator interface represents communication abilities.
interface Communicator {
    void communicate();
}

// The EmployeeChat class represents employees who can chat with colleagues.
class EmployeeChat implements Communicator {
    @Override
    public void communicate() {
        System.out.println("Employee can chat with colleagues");
    }
}

// The ManagerMeeting class represents managers who can conduct meetings.
class ManagerMeeting implements Communicator {
    @Override
    public void communicate() {
        System.out.println("Manager can conduct meetings");
    }
}

public class interfaces {
    public static void main(String[] args) {
        System.out.println("Welcome to the Company!");

        // Employees in the company
        Manager manager = new TeamLead();
        System.out.println("In the company, a " + manager.getClass().getSimpleName() + " is present:");
        manager.work();
        manager.supervise();

        // Tasks representing daily activities
        Task meetingTask = new Meeting();
        System.out.print("In the company, there is a task: ");
        meetingTask.execute();

        Task projectTask = new Project();
        System.out.print("In the company, there is a task: ");
        projectTask.execute();

        // Tools used by employees
        WorkTool laptop = new Laptop();
        System.out.print("Employees use a ");
        laptop.start();
        laptop.stop();

        WorkTool phone = new Phone();
        System.out.print("Employees use a ");
        phone.start();
        phone.stop();

        // Communication abilities
        Communicator employeeChat = new EmployeeChat();
        System.out.print("In the company, an employee has the ability to ");
        employeeChat.communicate();

        Communicator managerMeeting = new ManagerMeeting();
        System.out.print("In the company, a manager has the ability to ");
        managerMeeting.communicate();
    }
}
