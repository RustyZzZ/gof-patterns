from enum import Enum


class DocType(Enum):
    ONLY_CODE = "code"
    ONLY_TEXT = "text"
    TEXT_AND_CODE = "*"


class Document:
    def __init__(self, doc_type, text, code):
        self.doc_type = doc_type
        self.code = code
        self.text = text


class PlagiarismChecker:
    def __init__(self): pass

    def check(self, document: Document): pass


class ChnuChecker(PlagiarismChecker):

    def __init__(self):
        super().__init__()

    def check(self, document: Document):
        print("ChnuChecker checked. 90% originality")


class UnicheckChecker(PlagiarismChecker):

    def __init__(self):
        super().__init__()

    def check(self, document: Document):
        print("UnicheckChecker checked. 95% originality")


class GHChecker(PlagiarismChecker):

    def __init__(self):
        super().__init__()

    def check(self, document: Document):
        print("GHChecker checked. 93% originality")


class Checker:
    def __init__(self):
        self._checker = None

    def set_checker(self, strategy: PlagiarismChecker):
        self._checker = strategy

    def check(self, document: Document):
        if self._checker is None:
            print("No checker")
        else:
            self._checker.check(document)


if __name__ == '__main__':
    codeDoc = Document(DocType.ONLY_CODE, "code", None)
    textDoc = Document(DocType.ONLY_TEXT, None, "text")
    allDoc = Document(DocType.TEXT_AND_CODE, "code", "text")

    doc_to_use = allDoc
    checker = Checker()
    if doc_to_use.doc_type is DocType.ONLY_CODE:
        checker.set_checker(GHChecker())
    elif doc_to_use.doc_type is DocType.ONLY_TEXT:
        checker.set_checker(UnicheckChecker())
    else:
        checker.set_checker(ChnuChecker())

    checker.check(doc_to_use)
