def solution(nums):
    unique_types = len(set(nums))
    max_pick = len(nums) // 2
    
    return min(unique_types, max_pick)