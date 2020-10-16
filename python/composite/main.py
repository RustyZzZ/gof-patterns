import functools


class Evaluable:
    def get_sum_of_marks_for_branches(self) -> None:
        pass


class Lab(Evaluable):

    def __init__(self, number: int, mark: int):
        self.number = number
        self.mark = mark

    def get_sum_of_marks_for_branches(self) -> int:
        return self.mark


class LearningModule(Evaluable):

    def __init__(self, number: int, children: [Evaluable]):
        self.number = number
        self.children = children

    def get_sum_of_marks_for_branches(self) -> int:
        return functools.reduce(lambda acc, child: acc + child.get_sum_of_marks_for_branches(), self.children, 0)


class Subject:

    def __init__(self, name: str, children: [Evaluable]):
        self.name = name
        self.children = children

    def get_mark(self) -> int:
        return functools.reduce(lambda acc, child: acc + child.get_sum_of_marks_for_branches(), self.children, 0)


class Student:

    def __init__(self, name: str, subjects: [Subject]):
        self.subjects = subjects
        self.name = name

    def get_average(self) -> float:
        sum = functools.reduce(lambda acc, child: acc + child.get_mark(), self.subjects, 0)
        return sum / (len(self.subjects) * 1.0)


if __name__ == '__main__':
    module1 = LearningModule(1, [Lab(1, 20), Lab(2, 30)])
    module2 = LearningModule(2, [Lab(3, 50)])
    module1Python = LearningModule(1, [Lab(1, 50)])
    java = Subject("Java", [module1, module2])
    python = Subject("Python", [module1Python])
    print(Student("Diachuk", [java, python]).get_average())
