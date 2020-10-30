class Mark:

    def __init__(self, mark):
        self.mark = mark

    def fixed_mark(self):
        mark = self.mark
        self.mark = mark if mark < 100 else 100 - (mark - 100)


class Student:

    def __init__(self, name):
        self.name = name


class DbService:
    def __init__(self):
        pass

    @staticmethod
    def get_student(name):
        return Student(name)


class SuperPuperOldCoolMarkService:

    def __init__(self):
        pass

    def get_mark_by_student(self, student: Student):
        return Mark(len(student.name) * 10)


class MarkServiceFacade:

    def __init__(self):
        pass

    def get_mark_by_name(self, name: str):
        markService = SuperPuperOldCoolMarkService()
        student = DbService.get_student(name)
        mark = markService.get_mark_by_student(student)
        mark.fixed_mark()
        return mark.mark


if __name__ == '__main__':
    print(MarkServiceFacade().get_mark_by_name("Diachuk"))
