package com.prepa.base.file;

import com.prepa.base.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
