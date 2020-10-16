class WebMeetingService:

    def __init__(self):
        pass

    def start_meeting(self):
        pass


class ZoomMeeting(WebMeetingService):

    def __init__(self):
        super().__init__()

    def start_meeting(self):
        print("Zoom meeting started")


class GoogleMeeting(WebMeetingService):

    def __init__(self):
        super().__init__()

    def start_meeting(self):
        print("Google meeting started")


class UniversityClass:

    def __init__(self, meeting_service: WebMeetingService):
        self.meeting_service = meeting_service
        pass

    def start_class(self):
        pass


class LabClass(UniversityClass):

    def __init__(self, meeting_service: WebMeetingService):
        super().__init__(meeting_service)

    def start_class(self):
        print("lab class started")
        self.meeting_service.start_meeting()


class LectureClass(UniversityClass):

    def __init__(self, meeting_service: WebMeetingService):
        super().__init__(meeting_service)

    def start_class(self):
        print("lecture class started")
        self.meeting_service.start_meeting()


if __name__ == '__main__':
    LectureClass(GoogleMeeting()).start_class()
    LabClass(GoogleMeeting()).start_class()
    LectureClass(ZoomMeeting()).start_class()
    LabClass(ZoomMeeting()).start_class()
