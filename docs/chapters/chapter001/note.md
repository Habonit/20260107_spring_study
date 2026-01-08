# Info

**Chapter**: 001

**Date:** 2026-01-08

**Materials:** docs/pdf/1. 프로젝트 환경 설정.pdf

---
## Learn What

- mvc 구조 기초적인 동작 흐름
- controller의 역할
- welcom page 제작

---

## Notes

- Welcom Page는 static/index.html에 올려두면 기능을 제공한다. 
- @Controller를 달면 해당 클래스가 제어자라고, 웹 요청을 처리하는 컨트롤러로 등록
- @GetMapping("hello")은 @RequestMapping(method = RequestMethod.GET)의 축약형
  - http://localhost:8080/hello 으로 접속 시 해당 메서드 실행. 
  - @PostMapping: POST 요청 처리
  - @PutMapping: PUT 요청 처리
  - @DeleteMapping: DELETE 요청 처리
- Model 객체는 컨트롤러에서 스프링 컨테이너가 자동으로 파라미터에 주입 
  - Thymeleaf와 같은 View 에서 ${key}로 해당 값에 접근 가능
  - model.addAttribute("data", "hello!!") 라면 ${data}로 접근
- 컨트롤러가 붙은 클래스는 스프링 컨테이너에 등록되고, viewResolver가 템플릿 엔진에 따라 어떻게 보여줄지 결정