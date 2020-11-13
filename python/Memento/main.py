full_names = {"Diachuk": "Diachuk Rostyslav Liubomirovych", "Ivanov": "Ivanov Ivan Ivanovych"}
full_groups = {"643": "643 PZKS", "641": "641 KN"}


def get_full_name(name):
    full = full_names[name]
    if full is None:
        raise Exception("No such name :" + name + ": in db")
    return full


def get_full_group(group):
    full = full_groups[group]
    if full is None:
        raise Exception("No such group :" + group + ": in db")
    return full


class Student:
    class StudentMemento:
        def __init__(self, name, group):
            self._name = name
            self._group = group

        @property
        def name(self):
            return self._name

        @property
        def group(self):
            return self._group

    def __init__(self, name, group):
        self._name = name
        self._group = group

    def create_memento(self) -> StudentMemento:
        return self.StudentMemento(self._name, self._group)

    def restore_from(self, memento: StudentMemento):
        self._name = memento.name
        self._group = memento.group

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, value):
        self._name = value

    @property
    def group(self):
        return self._group

    @group.setter
    def group(self, value):
        self._group = value


if __name__ == '__main__':
    student = Student("Diachuk", "643")
    memento = student.create_memento()
    try:
        full_name = get_full_name(student.name)
        student.name = full_name
        group = get_full_group(student.group)
        student.group = group
    except Exception:
        print("Was Restored")
        student.restore_from(memento)

    print(str(student.name) + " " + str(student.group))
