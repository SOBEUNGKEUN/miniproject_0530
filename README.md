# BackEnd Project🔨
## JSON파일로 DB를 활용하여 비행 정보 확인 서비스
## 🚩프로젝트 목표
**CSV파일**을 읽을 수 있는 **CSVParser**구현<br>
**Java**와 **MySQL**을 연동하고,**CRUD 기능** 구현 후 **Postman**을 이용하여 테스트 진행.
## Team members  
강윤조 (GitHub Url : [https://github.com/YunJo0618](https://github.com/YunJo0618))  
소병권 (GitHub Url : [https://github.com/SOBEUNGKEUN](https://github.com/SOBEUNGKEUN))  
윤종섭 (GitHub Url : [https://github.com/deep-blue-dream](https://github.com/deep-blue-dream))  
최지원 (GitHub Url : [https://github.com/deeun](https://github.com/deeun)) 

## 🚩 Results  
-  CSVParser 구현 완료. 월별로 비행편 조회 성공
-  CRUD기능 중 Read기능만 구현 완료. Postman(GET)기능 구현
## 🚩트러블 슈팅
 - [ ] 전체 리스트 조회가 여러 번 반복됨
 -  변수명이 달라 관계가 없을것 같아 그냥 두었던 변수들이 작동해서 여러번 생성됨. 변수 정리를 통해 해결.
 - [ ] List조회시 같은 id가 24인 결과값 하나만 조회됨
 - Arraylist를 활용하여 해결
 - [ ] List조회시 같은 id가 24인 결과값이 24번 조회됨
 - getter,setter 메서드 확인 후 해결
    
## 🚩 Review 
### 강윤조![:소녀:](https://a.slack-edge.com/production-standard-emoji-assets/13.0/google-medium/1f467.png)  
변수나 메서드 이름이 겹치고 헷갈리면서 시간이 조금 오래 걸린것 같다. 또한 csv파일을 파싱하는 방법으로 진행하기 시작해서 시간은 더 걸렸던것 같지만 복습이 된것 같다. 리뷰시간에 틈틈히 팀원들과 이야기를 나누고 해왔던 것들이 정말 도움이 많이 된 것 같다. 시간이 부족해 결과는 아쉽게 나왔지만 정말 재미있고 많이 얻어간 프로젝트였다.

---

### 소병권 ![:남성:](https://a.slack-edge.com/production-standard-emoji-assets/13.0/google-medium/1f468.png)  
이번 프로젝트를 통해서 정말 많은 복습이 되었다. CSVParser부터 직접 구현해 보면서 코드의 작동원리를 파악했고,자바와 MySQL연동을 확실히 알 수있는 의미있는 시간이었다. 팀원들과 같이 코드를 짜고, 오류들을 끊임없이 연구해서 해결 할 수 있었다. 협력에 의미와 재미를 제대로 느낄수 있는 프로젝트였다.

---
### 윤종섭![:소년:](https://a.slack-edge.com/production-standard-emoji-assets/13.0/google-medium/1f466.png)  
JPA로 데이터 베이스와 자바에서 통신하는 과정을 실습하는 과정을 팀원들과 함께 구현해보는 시간을 가졌습니다. 수업 진행 순서를 따라가는 것 보다 수많은 예외처리를 겪으면서 문제 해결을 해 나가는 과정이 결코 의미없는 시간이라 생각하지 않습니다. 물론 그런 예외 발생을 줄이는 것도 많이 중요할 뿐더러 예외를 해결하는 경험의 필요성을 많이 느꼈습니다. 무엇보다 팀원들과 하나하나 확인 및 설명을 해 나가면서 그래도 팀으로써 협동하는 과정을 통해 좋은 경험을 할 수 있었습니다.

---
### 최지원 ![:소녀:](https://a.slack-edge.com/production-standard-emoji-assets/13.0/google-medium/1f467.png)  
수업시간 배운내용 위주로 복습한다고 생각했는데 왜 다 새로운지... 공부 열심히 해야겠다는 생각을 열심히 했다.

---

## TechStack  
<img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white](https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white)"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white](https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">  <img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=java&logoColor=white](https://img.shields.io/badge/Postman-007396?style=for-the-badge&logo=postman&logoColor=white)">

