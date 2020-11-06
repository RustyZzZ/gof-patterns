from abc import ABC, abstractmethod
from enum import Enum


class Action(Enum):
    INIT = "init"
    COMMIT = "commit"
    REVERT = "revert"
    PUSH = "push"


class GitService:
    def __init__(self):
        pass

    def commit(self, change): print("Change committed")

    def revert(self, change): print("Change Reverted")

    def init(self, change): print("Project initialized")

    def push(self, change): print("Project pushed and finished")


class Command(ABC):
    def __init__(self, service: GitService):
        self.service = service
        self.change = None

    def set_change(self, change):
        self.change = change
        return self

    @abstractmethod
    def execute(self): pass


class CommitCommand(Command):
    def execute(self):
        self.service.commit(self.change)


class PushCommand(Command):
    def execute(self):
        self.service.push(self.change)


class RevertCommand(Command):
    def execute(self):
        self.service.revert(self.change)


class InitCommand(Command):
    def execute(self):
        self.service.init(self.change)


class EditorController:
    commands = {
        Action.INIT: InitCommand(GitService()),
        Action.COMMIT: CommitCommand(GitService()),
        Action.REVERT: RevertCommand(GitService()),
        Action.PUSH: PushCommand(GitService())
    }

    def __init__(self):
        self.changeList = []
        pass

    def processCommand(self, action, change):
        self.changeList.append((EditorController.commands[action], change))

    def pushChangesToGit(self):
        for change in self.changeList:
            command = change[0]
            change = change[1]
            command.set_change(change).execute()

    def get_report_for_changes(self):
        for change in self.changeList:
            print(change)


if __name__ == '__main__':
    controller = EditorController()
    controller.processCommand(Action.INIT, None)
    controller.processCommand(Action.COMMIT, "a")
    controller.processCommand(Action.COMMIT, "as")
    controller.processCommand(Action.REVERT, None)
    controller.processCommand(Action.PUSH, None)

    controller.get_report_for_changes()
    controller.pushChangesToGit()
