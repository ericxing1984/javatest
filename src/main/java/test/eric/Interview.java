package test.eric;

import java.sql.Timestamp;
import java.util.*;

class Event {
    String type;
    Date time;

}

//version4

class EventManage {
    List<Event> eventList = new ArrayList<Event>();


    Map<String, Integer> countMap = new HashMap<String, Integer>();

    public void callback(Event event) {
        eventList.add(event);
        //do something
    }

    /*
    计算过去1小时内这种类型的事件发生的次数
     */
    public long hourlyCount(String type) {
        int count = 0;
        Date date = new Date();
        for (Event event : eventList) {
            if (event.type.equals(type) && date.getTime() - event.time.getTime() <= 3600 * 1000) {
                count++;
            }
        }
        return count;
    }
}
public class Interview {

    public static void main(String[] args) {

    }
}
