from collections import Counter
def solution(array):
    cnt = Counter(array)
    max_count = max(cnt.values())
    modes = [ k for k, v in cnt.items() if v == max_count]
    
    return modes[0] if len(modes) == 1 else -1