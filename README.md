# Design Pattern
## [Singleton](https://github.com/kilhyeongyeong/design_pattern/tree/main/design_pattern)
> 하나의 클래스에 오직 하나의 인스턴스만 가지는 패턴이며 보통 데이터 베이스 연결 모듀레 많이 사용
### 장점
* 하나의 인스턴스를 만들어 놓고 해당 인스턴스를 다른 모듈들이 공유하며 사용하기 때문에 인스턴스를 생성할 때 드는 비용이 줄어듬
### 단점
* TDD할 때 걸림돌(=결합도 증가)<br>
  TDD에서 수행하는 단위 테스트는 테스트가 서로 독립적이여야 하는데 Singleton Pattern은 **독립적인 인스턴스를 만들기가 어려움**
### 키워드
* **volatile**<br>
  Thread는 메인메모리에서 값을 복사하여 CPU 캐시에 저장하여 작업<br>
  하지만 CPU가 2개일 경우 서로 다른 CPU 캐시를 참조하게 될 것이며 서로 다른 결과값을 불러 일으킬 수 있음<br>
  이때 volatile 키워드는 CPU 캐시가 아닌 메인메모리에서 값을 공유 받음
* **syncronized**<br>
  멀티쓰레드 환경에서 각 Thread가 한 개씩만 접근 가능하도록 막음<br>
  성능 저하 우려 주의