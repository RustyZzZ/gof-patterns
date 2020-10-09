from __future__ import annotations
from abc import ABC, abstractmethod, abstractproperty
from typing import Any


class WebMeeting():
    def __init__(self, type, title):
        self.type = type
        self.title = title

    def start_meeting(self):
        print("meeting " + self.title + " started in " + self.type)


class WebMeetingBuilder(ABC):

    @abstractproperty
    def build(self) -> WebMeeting:
        pass

    @abstractmethod
    def set_type(self) -> WebMeetingBuilder:
        pass

    @abstractmethod
    def set_title(self, title) -> WebMeetingBuilder:
        pass


class HangoutsBuilder(WebMeetingBuilder):

    def __init__(self) -> None:
        self._type = None
        self._title = None

    def build(self) -> WebMeeting:
        meeting = WebMeeting(self._type, self._title)
        return meeting

    def set_type(self) -> WebMeetingBuilder:
        self._type = "Hangouts"
        return self

    def set_title(self, title) -> WebMeetingBuilder:
        self._title = title
        return self


class ZoomBuilder(WebMeetingBuilder):

    def __init__(self) -> None:
        self._type = None
        self._title = None

    def build(self) -> WebMeeting:
        meeting = WebMeeting(self._type, self._title)
        return meeting

    def set_type(self) -> WebMeetingBuilder:
        self._type = "ZOOM"
        return self

    def set_title(self, title) -> WebMeetingBuilder:
        self._title = title
        return self



if __name__ == "__main__":
    builder = HangoutsBuilder()
    builder.set_type().set_title("Patterns").build().start_meeting()
    builder = ZoomBuilder()
    builder.set_type().set_title("Patterns2").build().start_meeting()

