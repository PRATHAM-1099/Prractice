package LLD.MeetingScheduler;

import java.util.List;
import java.util.Map;

public class MeetingScheduler {
    MeetingRoomController meetingRoomController;


    public void scheduleMeeting(List<User> userList, Interval interval){
        meetingRoomController.meetingRoomCalenderMap.forEach((key, value) -> {
            value.intervalList.forEach(it -> {
                //Search if interval is available for booking in any of the meeting rooms
            });
        });
    }

//        public boolean scheduleMeeting(List<User> users, Interval interval){}
//        public boolean cancelMeeting(List<User> users, Interval interval);
//        public boolean bookRoom(MeetingRoom room, int numberOfPersons, Interval interval);
//        public boolean releaseRoom(MeetingRoom room, Interval interval);
//        public MeetingRoom checkRoomsAvailability(int numberOfPersons, Interval interval);


}
