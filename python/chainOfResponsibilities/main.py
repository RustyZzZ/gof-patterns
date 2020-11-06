class Document:

    def __init__(self, text, code):
        self.code = code
        self.text = text


class PlagiarismChecker:
    def __init__(self): pass

    def check(self, document: Document): pass


class AbstractChecker(PlagiarismChecker):
    def __init__(self, next: PlagiarismChecker):
        super().__init__()
        self.next = next

    def check(self, document: Document): pass


class ChnuChecker(AbstractChecker):
    def check(self, document: Document):
        if (document.text is not None) and (document.code is not None):
            print("Chnu check for plagiarism")
        if self.next is not None:
            self.next.check(document)


class GithubChecker(AbstractChecker):
    def check(self, document: Document):
        if document.code is not None:
            print("Github check for plagiarism")
        if self.next is not None:
            self.next.check(document)


class UnicheckChecker(AbstractChecker):
    def check(self, document: Document):
        if document.text is not None:
            print("Unicheck check for plagiarism")
        if self.next is not None:
            self.next.check(document)


if __name__ == '__main__':
    checkerChain = UnicheckChecker(GithubChecker(ChnuChecker(None)))
    checkerChain.check(Document("Text", ""))
