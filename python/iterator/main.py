class Iterator:  # interface
    def has_next(self):
        pass

    def get_next(self):
        pass


class Student:

    def __init__(self, name, group):
        self._name = name
        self._group = group


class StudentListNode(Iterator):

    def __init__(self, current: Student, next):
        self._current = current
        self._next = next

    def has_next(self):
        return self._next is not None

    def get_next(self):
        if self._next is None:
            raise Exception("It was last element")
        return self._next


class StudentList:

    def __init__(self, start: StudentListNode):
        self._start = start

    def get_iterator(self):
        return self._start


if __name__ == '__main__':
    list = StudentList(
        StudentListNode(
            Student("Diachuk", 643), StudentListNode(
                Student("Diachuk2", 543), StudentListNode(
                    Student("Diachuk3", 443), None)
            )
        )
    )
    iterator = list.get_iterator()
    while True:
        print(iterator._current._name)
        if not iterator.has_next():
            break
        iterator = iterator.get_next()
