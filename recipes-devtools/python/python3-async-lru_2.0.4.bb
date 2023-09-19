SUMMARY = "Simple LRU cache for asyncio"
HOMEPAGE = "https://github.com/aio-libs/async-lru"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=637551ffe345b083f0847cebe17a634d"

SRC_URI[md5sum] = "cd57e4d7f51bcbe2b940c523a5851b40"
SRC_URI[sha256sum] = "b8a59a5df60805ff63220b2a0c5b5393da5521b113cd5465a44eb037d81a5627"

PYPI_PACKAGE = "async-lru"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"
