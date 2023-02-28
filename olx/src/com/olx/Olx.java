package com.olx;

import java.util.ArrayList;
import java.util.List;

public class Olx {
    List<User> users;
    List<Post> posts;

    private static Olx olx;
    public static Olx getInstance() {
        if(olx == null){
            olx = new Olx();
            olx.users =  new ArrayList<>();
            olx.posts = new ArrayList<>();
        }
        return olx;
    }

    private UserDetails getUserDetails( User user) {
        UserDetails userDetails = new UserDetails(); //create object
        String name = user.getFirstName() + " " +user.getMiddleName() +" "+ user.getLastName();
        userDetails.setName(name); //set name

        String address = user.getAddresses().get(0).getAddress();
        userDetails.setAddress(address); //set address

        String mobileNo = user.getMobileNo();
        userDetails.setMobileNo(mobileNo); //set mobileNo

        String username = user.getUsername();
        userDetails.setUsername(username); //set username
        return  userDetails;
    }

    public UserDetails registerUser(User user){
        //validation logic
        //check user object details are correct;
        //check if already username is taken // return false;
        users.add(user); //register user
        //create UserDetails Object to return;
        UserDetails userDetails = getUserDetails(user);
        return userDetails;
    }

    public UserDetails login(Login login){
        for(User user : users){
            if(user.getUsername().equals(login.getUsername()) && user.getPassword().equals(login.getPassword())) {
                return getUserDetails(user);
            }
        }
        return null;
    }
    public boolean checkIfUserExists(User user) {
        for(User u : users){
            if(u.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public Post createPost(Post post) {
        //validation logic
        posts.add(post);
        return post;
    }

    public List<Post> searchByCity(String city) {
        List<Post> ans = new ArrayList<>();
        for( Post p : posts){
            if(p.getCity().equals(city)){
                ans.add(p);
            }
        }
        return ans;
    }

    public List<Post> searchByLocation(Location location) {
        List<Post> ans = new ArrayList<>();
        for( Post p : posts){
            if(p.getLocation().getxCord() == location.getxCord() && p.getLocation().getyCord() == location.getyCord()){
                ans.add(p);
            }
        }
        return ans;
    }

    public long getUsersCount(){
        return users.size();
    }
    public long getPostsCount(){
        return posts.size();
    }
}


