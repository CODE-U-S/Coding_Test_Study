def solution(id_list, report, k):
    answer = [0] * len(id_list)
    report = set(report)
    reportCnt = [0] * len(id_list)
    suspended = set()  
    
    for r in report:
        reported = r.split()[1]
        idx = id_list.index(reported)
        reportCnt[idx] += 1
        
    for idx, cnt in enumerate(reportCnt):
        if cnt >= k:
            suspended.add(id_list[idx])
            
    for r in report:
        reporter, reported = r.split()
        if reported in suspended:
            idx = id_list.index(reporter)
            answer[idx] += 1     
    return answer