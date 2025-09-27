def solution(s):
    last_seen = {}  # 문자별 마지막 등장 위치 저장
    result = []
    
    for i, ch in enumerate(s):
        if ch in last_seen:
            result.append(i - last_seen[ch])  # 이전 등장 위치와의 거리
        else:
            result.append(-1)  # 처음 나온 경우
        last_seen[ch] = i  # 마지막 위치 갱신
    
    return result