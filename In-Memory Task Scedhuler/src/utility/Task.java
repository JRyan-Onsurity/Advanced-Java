package utility;

import java.util.concurrent.atomic.AtomicInteger;
import static utility.StatusType.*;
public class Task {
  //  private int id=0;
    private  Integer id;
    private final TaskType taskType;
    private String TaskStatus=CREATED.name();

    protected Task( TaskType taskType, Integer id) {
       // id.incrementAndGet();
        this.id=id;
        this.taskType = taskType;
    }
    public Integer getId() {
        return id;
    }
    public TaskType getTaskType() {

        return taskType;
    }
    public String getTaskStatus() {

        return TaskStatus;
    }
    public void setStatus(String status) {
        TaskStatus=status;
    }
}

