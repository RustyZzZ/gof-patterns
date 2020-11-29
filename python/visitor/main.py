class Visitor:
    def __init__(self):
        pass

    def do_lab(self):
        pass

    def do_lect(self):
        pass


class StartNotificationVisitor(Visitor):

    def __init__(self):
        super().__init__()

    def do_lab(self):
        print("Lab started")

    def do_lect(self):
        print("Lecture started")


class EndNotificationVisitor(Visitor):

    def __init__(self):
        super().__init__()

    def do_lab(self):
        print("Lab Finished")

    def do_lect(self):
        print("Lecture Finished")


class UniversityClass:

    def __init__(self):
        pass

    def accept(self, visitor: Visitor):
        pass


class LectureClass(UniversityClass):

    def __init__(self):
        super().__init__()

    def accept(self, visitor: Visitor):
        visitor.do_lect()


class LabClass(UniversityClass):

    def __init__(self):
        super().__init__()

    def accept(self, visitor: Visitor):
        visitor.do_lab()


if __name__ == '__main__':
    lab_class = LabClass()
    lect_class = LectureClass()

    lab_class.accept(StartNotificationVisitor())
    lect_class.accept(StartNotificationVisitor())
    lab_class.accept(EndNotificationVisitor())
    lect_class.accept(EndNotificationVisitor())
