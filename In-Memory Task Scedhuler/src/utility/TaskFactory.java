package utility;

public class TaskFactory {

    public static Task getTask(TaskType taskType, Integer id){

        return new Task(taskType, id);
    }

}
