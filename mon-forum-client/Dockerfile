FROM node:14-alpine3.12 as build
WORKDIR /usr/local/app
COPY ./ /usr/local/app/
RUN npm install
RUN npm run build
FROM nginx:1.21.4
COPY --from=build /usr/local/app/dist/mon-forum-client /usr/share/nginx/html