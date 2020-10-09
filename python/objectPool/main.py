class WebMeeting:
    debt = 0

    def __init__(self, id, type, title):
        self._id = id
        self._type = type
        self._title = title
        self._status = "Ready"
        if type == "ZOOM":
            WebMeeting.debt = WebMeeting.debt + 10
        else:
            WebMeeting.debt = WebMeeting.debt + 20

    def start_meeting(self):
        self._status = "Running"
        print(self._title + " Running " + self._type)
        print(WebMeeting.debt)

    def finish_meeting(self):
        print(self._title + " Finished " + self._type)
        self._status = "Ready"
        self._title = ""

    def is_ready(self):
        return self._status == "Ready"

    def update_title(self, title):
        self._title = title


class WebMeetingPool:
    def __init__(self):
        pass

    _pool = [WebMeeting(1, "ZOOM", ""), WebMeeting(2, "HANGOUTS", "")]

    def _is_free(self, meeting):
        return meeting.is_ready()

    def start_meeting_for(self, title) -> WebMeeting:
        freeMeetings = list(filter(self._is_free, WebMeetingPool._pool))
        if freeMeetings:
            meeting = freeMeetings[0]
            meeting.update_title(title)
            meeting.start_meeting()
            return meeting
        else:
            print("No free meetings")

    def release_meeting(self, meeting):
        meeting.finish_meeting()


if __name__ == '__main__':
    pool = WebMeetingPool()
    algebra = pool.start_meeting_for("Algebra")
    algebra2 = pool.start_meeting_for("Algebra2")
    pool.release_meeting(algebra2)
    algebra3 = pool.start_meeting_for("Algebra3")
