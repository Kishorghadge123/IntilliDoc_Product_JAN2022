package Utilities;

import com.google.api.gax.paging.Page;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

    public class UploadObject {
        public static void uploadObject(
                String projectId, String bucketName, String objectName, String filePath) throws IOException {

            StorageOptions storageOptions = StorageOptions.newBuilder()
                    .setProjectId(projectId)
                    .setCredentials(GoogleCredentials.fromStream(new
                            FileInputStream(ReadProps.readAttr("GOOGLE_APPLICATION_CREDENTIALS")))).build();
            Storage storage = storageOptions.getService();


            BlobId blobId = BlobId.of(bucketName, objectName);
            BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
            storage.create(blobInfo, Files.readAllBytes(Paths.get(filePath)));

            System.out.println(
                    "File " + filePath + " uploaded to bucket " + bucketName + " as " + objectName);
        }

        // use this to call below function from test classes - UploadObject.authImplicit(ReadProps.readAttr("project_id"));
        public static void authImplicit(String projectId) throws IOException {
            StorageOptions storageOptions = StorageOptions.newBuilder()
                    .setProjectId(projectId)
                    .setCredentials(GoogleCredentials.fromStream(new
                            FileInputStream(ReadProps.readAttr("GOOGLE_APPLICATION_CREDENTIALS")))).build();
            Storage storage = storageOptions.getService();

            System.out.println("Buckets:");
            Page<Bucket> buckets = storage.list();
            for (Bucket bucket : buckets.iterateAll()) {
                System.out.println(bucket.toString());
            }
        }
    }
