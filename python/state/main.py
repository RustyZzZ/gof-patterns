class State:
    def __init__(self, test):
        self.test = test

    def change_state(self):
        pass

    def get_mark(self):
        pass

    def get_task(self):
        pass

    def get_answer(self):
        pass


class VerifiedState(State):

    def __init__(self, test):
        super().__init__(test)

    def change_state(self):
        print("It is final state. No way to change")

    def get_mark(self):
        print("Mark is 30")

    def get_task(self):
        print("Task was blah blah blah")

    def get_answer(self):
        print("Student Answered: Blah blah Blah Blah")


class FinishedState(State):

    def __init__(self, test):
        super().__init__(test)

    def change_state(self):
        print("### finished -> verified")
        self.test.state = VerifiedState(self.test)

    def get_mark(self):
        print("No marks yet. It is not verified")

    def get_task(self):
        print("Task is blah blah")

    def get_answer(self):
        print("Student Answered: Blah blah Blah Blah")


class StartedState(State):

    def __init__(self, test):
        super().__init__(test)

    def change_state(self):
        print("### started -> finished")
        self.test.state = FinishedState(self.test)

    def get_mark(self):
        print("No marks yet")

    def get_task(self):
        print("Task is blah blah")

    def get_answer(self):
        print("No answers yet")


class CreatedState(State):

    def change_state(self):
        print("### created -> started")
        self.test.state = StartedState(self.test)

    def get_mark(self):
        print("No marks yet")

    def get_task(self):
        print("Task is visible only after test starts")

    def get_answer(self):
        print("No answers yet")


class ModuleTest:
    def __init__(self, name):
        print("### moduleTest is created")
        self.state = CreatedState(self)
        self.name = name

    def get_name(self):
        print("Name is " + self.name)

    def change_state(self):
        self.state.change_state()

    def get_mark(self):
        self.state.get_mark()

    def get_task(self):
        self.state.get_task()

    def get_answer(self):
        self.state.get_answer()


if __name__ == '__main__':
    test = ModuleTest("Diachuk") # created
    test.get_task()
    test.change_state()  # started
    test.get_task()
    test.get_answer()
    test.change_state()  # finished
    test.get_answer()
    test.get_mark()
    test.change_state()  # verified
    test.get_mark()
    test.change_state()
