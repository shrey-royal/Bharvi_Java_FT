class Manager {
    public void assignTaskToTeamLead() {
        System.out.println("Assigning tasks...");
    }
}

class TeamLead extends Manager {
    public void assignTaskToDeveloper() {
        System.out.println("Assigning tasks...");
    }
}

class Developer extends Manager {
    public void completeTask() {
        System.out.println("Completing task...");
    }
    
    public void writeCode() {
        System.out.println("Writing code...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();
        TeamLead teamLead = new TeamLead();
        Developer developer = new Developer();

        manager.assignTaskToTeamLead();
        teamLead.assignTaskToDeveloper();
        developer.completeTask();
        developer.writeCode();
    }
}
