package io.github.unlp.oo;

import java.util.List;

public class ProxyPost implements PersistableUser{
    private User realUser;
    private PostRepository postRepository;
    private List<Post> posts;

    public ProxyPost(User realUser, PostRepository postRepository) {
        this.realUser = realUser;
        this.postRepository = postRepository;
    }

    @Override
    public String getUsername() {
        return realUser.getUsername();
    }

    @Override
    public String getEmail() {
        return realUser.getEmail();
    }

    @Override
    public List<Post> getPosts() {
        if (this.posts == null) {
            return postRepository.findPostsByUsername(this.getUsername());
        }
        else return posts;
    }
}
