package com.mcanoy.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mcanoy.entity.BlogEntry;

@Controller
public class BlogController {
    @RequestMapping(value = "/blogs", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<List<BlogEntry>> blogList() {
        
        int day = 1000 * 60 * 60 * 24;
        
        List<BlogEntry> blogList = new ArrayList<>();
        
        BlogEntry blog = new BlogEntry();
        blog.setUrl("https://blog.openshift.com/7-habits-highly-effective-devops/");
        blog.setTitle("The 7 Habits of Highly Effective DevOps");
        blog.setContent("As I wrote last week, we’ve recently had the opportunity to speak with 100s of Enterprise companies as part of the Culture, Containers and accelerating DevOps events with Gene Kim (@realgenekim). During those discussions, we’ve been able to learn about lessons since the Phoenix Project and the most important metrics for measuring DevOps success. We’ve also learned […]");
        blog.setLastModifiedDate(new Date());
        blogList.add(blog);
        
        blog = new BlogEntry();
        blog.setUrl("https://blog.openshift.com/kubernetes-little-guide-install-options/");
        blog.setTitle("Kubernetes: A Little Guide to Install Options");
        blog.setContent("Get a quick guide to the many ways to install Kubernetes, from manual to installer-based to hosted environments.");
        blog.setLastModifiedDate(new Date(System.currentTimeMillis() - day));
        blogList.add(blog);
        
        blog = new BlogEntry();
        blog.setUrl("https://blog.openshift.com/kubernetes-little-guide-install-options/");
        blog.setTitle("Monitoring your DevOps");
        blog.setContent("Learn how CollabNet’s DevOps Lifecycle Manager approach works with OpenShift to enable continuous monitoring and feedback across their idea-to-delivery toolchains for projects, applications, and services in this OpenShift Commons Briefing.");
        blog.setLastModifiedDate(new Date(System.currentTimeMillis() - day - day));
        blogList.add(blog);
        
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}