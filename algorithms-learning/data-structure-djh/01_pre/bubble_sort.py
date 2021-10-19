from typing import List


def sort(num_list: List[int]):
    length = len(num_list)
    sorted = False
    while not sorted:
        sorted = True
        for i in range(length - 1):
            if num_list[i] > num_list[i + 1]:
                tmp = num_list[i]
                num_list[i] = num_list[i + 1]
                num_list[i + 1] = tmp
                sorted = False
        length -= 1
    return num_list


num_list = [12, 23, 34, 1, 4, 6, 3, 2, 1]
print(sort(num_list))
