class PlagiarismChecker:

    def __init__(self, file):
        self.file = file

    def check_plagiarism(self): pass


class ChnuPlagiarismChecker(PlagiarismChecker):

    def check_plagiarism(self):
        print("Chnu checking for plagiarism")


class PlagiarismCheckerDecorator(PlagiarismChecker):

    def __init__(self, checker: PlagiarismChecker):
        self.checker = checker
        self.result = 0
        super().__init__(checker.file)

    def check_plagiarism(self):
        pass


class UniCheckDecorator(PlagiarismCheckerDecorator):
    def check_plagiarism(self):
        self.checker.check_plagiarism()
        n = 3
        if (hasattr(self.checker, 'result')):
            self.result = self.checker.result * 0.2 + n * 0.8
        else:
            self.result = n


class GithubCheckDecorator(PlagiarismCheckerDecorator):
    def check_plagiarism(self):
        self.checker.check_plagiarism()
        n = 4
        if (hasattr(self.checker, 'result')):
            self.result = self.checker.result * 0.7 + n * 0.3
        else:
            self.result = n


if __name__ == '__main__':
    decorator = UniCheckDecorator(GithubCheckDecorator(ChnuPlagiarismChecker("MyBestKursova.doc")))
    decorator.check_plagiarism()
    print(decorator.result)
