from abc import ABC, abstractmethod
from builtins import print, super, str


class UnivClass(ABC):
    def __init__(self, subject):
        self.subject = subject

    @abstractmethod
    def notify(self): pass


class LabClass(UnivClass):
    def __init__(self, subject=None, group=None):
        UnivClass.__init__(self, subject)
        self.group = group

    def notify(self): print(str(self.group) + ' group will have Lab class ' + self.subject)


class LectureClass(UnivClass):
    def __init__(self, subject=None, group=None):
        UnivClass.__init__(self, subject)
        self.group = group

    def notify(self): print(str(self.group) + ' group will have Lecture class ' + self.subject)


class Log(ABC):
    def __init__(self): pass

    @abstractmethod
    def prepare_log(self): pass


class VisitorLog(Log):
    def __init__(self):
        super().__init__()

    def prepare_log(self): print("Visitor log prepared for Lecture class")


class GradeLog(Log):
    def __init__(self):
        super().__init__()

    def prepare_log(self): print("Grade log prepared for Lab class")


class ClassFactory(ABC):
    def __init__(self):
        pass

    @abstractmethod
    def schedule_class(self) -> UnivClass: pass

    @abstractmethod
    def create_log(self) -> Log: pass


class LabClassFactory(ClassFactory):
    def __init__(self):
        super().__init__()

    def schedule_class(self) -> UnivClass: return LabClass()

    def create_log(self) -> Log: return GradeLog()


class LectureClassFactory(ClassFactory):
    def __init__(self):
        super().__init__()

    def schedule_class(self) -> UnivClass: return LectureClass()

    def create_log(self) -> Log: return VisitorLog()


class ClassScheduler:
    def __init__(self):
        pass

    def schedule_class(self, type, subject, group):
        factory = LabClassFactory() if type == "LAB" else LectureClassFactory()
        cl = factory.schedule_class()
        cl.subject = subject
        cl.group = group
        cl.notify()
        factory.create_log().prepare_log()


if __name__ == '__main__':
    ClassScheduler().schedule_class("LAB", "GOF PATTERNS", 343)
    ClassScheduler().schedule_class("LECTURE", "GOF PATTERNS", 343)
