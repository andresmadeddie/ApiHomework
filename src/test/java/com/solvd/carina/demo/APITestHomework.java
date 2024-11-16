package com.solvd.carina.demo;

import com.solvd.carina.demo.api.homework.*;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APITestHomework implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "Andres")
    public void createPostTest() {
        CreatePost createPost = new CreatePost();
        createPost.callAPIExpectSuccess();
        createPost.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void deletePostTest() {
        DeletePostOne deletePostOne = new DeletePostOne();
        deletePostOne.callAPIExpectSuccess();
        deletePostOne.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void getAllPostsTest() {
        GetAllPosts getAllPosts = new GetAllPosts();
        getAllPosts.callAPIExpectSuccess();
        getAllPosts.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());

    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void getAllUserOneAlbumsTest() {
        GetAllUserOneAlbums getAllUserOneAlbums = new GetAllUserOneAlbums();
        getAllUserOneAlbums.callAPIExpectSuccess();
        getAllUserOneAlbums.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void getAllUserOneContentTest() {
        GetAllUserOneContent getAllUserOneContent = new GetAllUserOneContent();
        getAllUserOneContent.callAPIExpectSuccess();
        getAllUserOneContent.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void getAllUserOnePhotosTest() {
        GetAllUserOnePhotos getAllUserOnePhotos = new GetAllUserOnePhotos();
        getAllUserOnePhotos.callAPIExpectSuccess();
        getAllUserOnePhotos.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "Andres")
    public void getCommentByPostIdOneTest() {
        GetCommentByPostIdOne getCommentByPostIdOne = new GetCommentByPostIdOne();
        getCommentByPostIdOne.callAPIExpectSuccess();
        getCommentByPostIdOne.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void getPostOneTest() {
        GetPostOne getPostOne = new GetPostOne();
        getPostOne.callAPIExpectSuccess();
        getPostOne.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void getPostOneCommentsTest() {
        GetPostOneComments getPostOneComments = new GetPostOneComments();
        getPostOneComments.callAPIExpectSuccess();
        getPostOneComments.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Andres")
    public void updatePostOneTest() {
        UpdatePostOne updatePostOne = new UpdatePostOne();
        updatePostOne.callAPIExpectSuccess();
        updatePostOne.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }
}
