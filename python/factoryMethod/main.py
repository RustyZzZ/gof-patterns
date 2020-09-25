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


class ClassFactory(ABC):
    def __init__(self):
        pass

    @abstractmethod
    def schedule_class(self) -> UnivClass: pass


class LabClassFactory(ClassFactory):
    def __init__(self):
        super().__init__()

    def schedule_class(self) -> UnivClass: return LabClass()


class LectureClassFactory(ClassFactory):
    def __init__(self):
        super().__init__()

    def schedule_class(self) -> UnivClass: return LectureClass()


def schedule_lecture_and_lab_classes(subject, group):
    factories = [LectureClassFactory(), LabClassFactory()]
    for factory in factories:
        cl = factory.schedule_class()
        cl.subject = subject
        cl.group = group
        cl.notify()


if __name__ == '__main__':
    schedule_lecture_and_lab_classes("GOF PATTERNS", 343)
