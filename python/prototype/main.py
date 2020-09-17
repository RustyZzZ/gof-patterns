from builtins import print

import copy


class SomeComponent:
    def __init__(self, some_int, some_list_of_objects):
        self.some_int = some_int
        self.some_list_of_objects = some_list_of_objects


if __name__ == "__main__":

    list_of_objects = [1, {1, 2, 3}, [1, 2, 3]]
    component = SomeComponent(23, list_of_objects)
    copied_component = copy.copy(component)
    copied_component.some_list_of_objects.append("copy")
    if copied_component.some_list_of_objects[-1] == "copy":
        print("Copy`s array was changed")
    if component.some_list_of_objects[-1] == "copy":
        print("Original`s array was changed")

    deep_copied_component = copy.deepcopy(component)
    deep_copied_component.some_list_of_objects.append("deep")
    if deep_copied_component.some_list_of_objects[-1] == "deep":
        print("Deep Copy`s array was changed")
    if component.some_list_of_objects[-1] == "deep":
        print("Original`s array was changed")
