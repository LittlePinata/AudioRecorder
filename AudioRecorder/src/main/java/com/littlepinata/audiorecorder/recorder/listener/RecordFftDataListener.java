package com.littlepinata.audiorecorder.recorder.listener;


public interface RecordFftDataListener {

    /**
     * @param data 录音可视化数据，即傅里叶转换后的数据：fftData
     */
    void onFftData(byte[] data);

}
